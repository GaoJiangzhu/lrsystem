package cn.nstl.controller;

import cn.nstl.common.Response;
import cn.nstl.controller.base.BaseController;
import cn.nstl.utils.PropertiesUtil;
import cn.nstl.utils.UUIDUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("upload")
@Controller
public class FileUploadController extends BaseController {

    @RequestMapping("uploading")
    @ResponseBody
    public Response uploading(@RequestParam("file") MultipartFile file) throws IOException {
        if (null == file) {
            return Response.createBySuccess();
        }
        String fileName = file.getOriginalFilename();

        fileName = UUIDUtil.getUUID()+fileName.substring(fileName.lastIndexOf("."),fileName.length());
        String dir = PropertiesUtil.UPLOAD_PATH+File.separator;    //设定文件保存的目录
        FileUtils.writeByteArrayToFile(new File(dir, fileName), file.getBytes());
        return Response.createBySuccess(dir+fileName);
    }
}
