package cn.nstl.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

public class ExcelUtil {

    public static void exportExcel(HttpServletResponse response, String title, LinkedHashMap<String, String> titles, List<Map<String, Object>> data) throws IOException {
        //创建HSSFWorkbook对象(excel的文档对象)
        HSSFWorkbook wb = new HSSFWorkbook();
        //建立新的sheet对象（excel的表单）
        HSSFSheet sheet = wb.createSheet(title);

        //在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
        HSSFRow row1 = sheet.createRow(0);
        //创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
        HSSFCell cell = row1.createCell(0);
        //设置单元格内容
        cell.setCellValue(title);
        //合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, titles.size()));
        sheet.setColumnWidth(0, 256*30+184);

        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // cellStyle.setAlignment(HorizontalAlignment.CENTER);

        HSSFRow rowtitle = sheet.createRow(1);
        //创建单元格并设置单元格内容
        int titlecount = 0;
        for (Map.Entry<String, String> entry : titles.entrySet()) {
            if (titlecount<titles.size()){
                rowtitle.createCell(titlecount).setCellValue(entry.getValue());
                titlecount++;
            }
        }
        int datacount = 1;
        for (int i = 0; i < data.size(); i++) {
            HSSFRow row=sheet.createRow(datacount+1);
            int rowcount = 0;
            for (Map.Entry<String, String> entry : titles.entrySet()) {
                if (rowcount<titles.size()){
                    row.createCell(rowcount).setCellValue(data.get(i).get(entry.getKey())==null?StringUtils.EMPTY :data.get(i).get(entry.getKey()).toString());
                    rowcount ++;
                }
            }
            datacount++;

        }
        //输出Excel文件
        OutputStream output=response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition", "attachment; filename="+title+".xls");
        response.setContentType("application/msexcel");
        response.setCharacterEncoding("UTF-8");
        wb.write(output);
        output.close();

    }


    public static List<Object> getExcelData(String path,Class classes, Map<String , String > columnMap) throws Exception{
        List<Object> list = new ArrayList<>();
        //用流去读取读取数据
        Map<String,Object> map = new HashMap<>();
        List<String> headerList = new ArrayList<>();
        ///////////////////////////////////////////


        ///////////////////////////////////////////
        String[] split = path.split(",");
        for (int i = 0; i < split.length; i++) {
            if (StringUtils.isBlank(split[i])){
                continue;
            }
//            InputStream inputStream = new FileInputStream(split[i]);
//            POIFSFileSystem poifsFileSystem = new POIFSFileSystem(inputStream);
//            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(poifsFileSystem);
//            HSSFSheet sheets = hssfWorkbook.getSheetAt(0);
            String extString = split[i].substring(path.lastIndexOf("."));
            InputStream is = null;
            is = new FileInputStream(split[i]);
            Workbook wb = null;
            if("xls".equals(extString)){
                wb = new HSSFWorkbook(is);
            }else if("xlsx".equals(extString)){
                wb = new XSSFWorkbook(is);
            }
            Sheet sheet= wb.getSheetAt(0);
            int rowNum = sheet.getLastRowNum();//行数
            for (int j = 0; j <= rowNum; j++) {
//                HSSFRow rows = sheets.getRow(j);//单元格数
                Row row=sheet.getRow(j);
                if(row != null){
                    int rowLength = row.getLastCellNum();
                    if(j==2) {
                        for (int k = 0; k < rowLength; k++) {
                            headerList.add(row.getCell(k).getStringCellValue());
                        }
                        map.put("headerList",headerList);
                    }else if(j>2){
                        Object obj = classes.newInstance();
                        for (int k = 0; k < headerList.size(); k++) {
                            if(row.getCell(k)!=null) {
                                Field f = classes.getDeclaredField(columnMap.get(headerList.get(k)));
                                f.setAccessible(true);
                                if (StringUtils.equals(columnMap.get(columnMap.get(headerList.get(k))), "String")) {
                                    //将row的只全部转换成String
                                    row.getCell(k).setCellType(Cell.CELL_TYPE_STRING);
                                    f.set(obj, row.getCell(k).getStringCellValue());
                                }
                            }
                        }
                        list.add(obj);
                    }
                }
            }
        }
        return list;
    }


    public static List<Object> getUplodExcelData(MultipartFile file, Class classes, Map<String , String > columnMap) throws Exception{
        List<Object> list = new ArrayList<>();
        //用流去读取读取数据
        Map<String,Object> map = new HashMap<>();
        List<String> headerList = new ArrayList<>();
        String fileName=file.getOriginalFilename();
        String extString = fileName.substring(fileName.lastIndexOf("."));
        InputStream is = null;
        is = file.getInputStream();
        Workbook wb = null;
        if(".xls".equals(extString)){
            wb = new HSSFWorkbook(is);
        }else if(".xlsx".equals(extString)){
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet= wb.getSheetAt(0);
        int rowNum = sheet.getLastRowNum();//行数
        for (int j = 0; j <= rowNum; j++) {
            Row row = sheet.getRow(j);//单元格数
            if(row != null){
                int rowLength = row.getLastCellNum();
                if(j==2) {
                    for (int k = 0; k < rowLength; k++) {
                        headerList.add(row.getCell(k).getStringCellValue());
                    }
                    map.put("headerList",headerList);
                }else if(j>2){
                    Object obj = classes.newInstance();
                    for (int k = 0; k < headerList.size(); k++) {
                        if(row.getCell(k)!=null){
                            Field f = classes.getDeclaredField(columnMap.get(headerList.get(k)));
                            f.setAccessible(true);
                            if (StringUtils.equals(columnMap.get(columnMap.get(headerList.get(k))), "String")){
                                //将row的只全部转换成String
                                row.getCell(k).setCellType(Cell.CELL_TYPE_STRING);
                                f.set(obj, row.getCell(k).getStringCellValue());
                            }
                        }
                    }
                    list.add(obj);
                }
            }
        }
        return list;
    }
}