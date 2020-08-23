/**
 * subscriber js方法
 * @author dongzeliang
 *
 */


/**
 * 初始化表头
 * @type {*[]}
 */
var colModel = [
    {name:'unit',index:'unit'},
    {name:'agents',index:'agents'},
    {name:'resourceType',index:'resourceType'},
    {name:'billingSum',index:'billingSum',  align:"center"},
    {name:'billingSuccess',index:'billingSuccess'},
    {name:'billingFailure',index:'billingFailure'},
    {name:'arrivalSnm',index:'arrivalSnm'},
    {name:'arrivalRate',index:'arrivalRate'},
    {name:'toAll',index:'toAll'},
    {name:'toAllRate',index:'toAllRate'},
    {name:'noBilling',index:'noBilling'},
    {name:'noBillingRate',index:'noBillingRate'}
];

/**
 * 初始化表格
 * @param grid_selector
 * @param pager_selector
 */
function initGrid(grid_selector, pager_selector){
    jQuery(grid_selector).jqGrid({
        // 数据源
        url:"getResourceArrival",
        // 数据格式
        datatype: "json",
        // 数据获取方式
        mtype:"GET",
        // 高度
        height: 392,
        // 表头名称
        colNames:['单位','代理商', '资源类型','发订数','发订成功','发订未成功','到货数','到货率','到全','到全率','一期未到','一期未到率'],
        // 表头数据
        colModel:colModel,
        //添加左侧行号
        // rownumbers: true,
        //是否在浏览导航栏显示记录总数
        viewrecords : true,
        //每页显示记录数
        rowNum:10,
        //用于改变显示行数的下拉列表框的元素数组。
        rowList:[10,20,30],
        // 分页显示位置
        pager : pager_selector,
        // 设置为交替行表格
        altRows: true,
        // 可以实现全选的操作
        // multiselect: true,
        /*
            false：点击行时，同时选中改行的复选框，支持多行选中
            true：点击行时，只将点击的行处理为选中状态，切换其他行时，原选中行的选中效果被取消
        */
        multiboxonly: true,
        // 加载完毕事件
        loadComplete : function() {
            var table = this;
            setTimeout(function(){
                updatePagerIcons(table);
            }, 0);
        },
        });
        setGroupHeader(grid_selector,"billingSum",6,"资源品种到货统计");
}
function setGroupHeader(grid_selector,header,num,title){
    $( grid_selector ).jqGrid( 'setGroupHeaders' , {
        useColSpanStyle :  true ,  // 没有表头的列是否与表头列位置的空单元格合并
        groupHeaders : [ {
            startColumnName :  header ,  // 对应colModel中的name
            numberOfColumns : num,  // 跨越的列数
            titleText :  title
        }]
    });
}


jQuery(function($) {
    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    var parent_column = $(grid_selector).closest('[class*="col-"]');
    //resize to fit page size
    $(window).on('resize.jqGrid', function () {
        $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
    })

    initGrid(grid_selector, pager_selector);
    //给序号列添加表头，默认没有表头
    jQuery(grid_selector).jqGrid('setLabel','rn', '序号', {'text-align':'center','vertical-align':'middle'});

    //设置表头居中，
    $("th > div").css('text-align','center');

    $(window).triggerHandler('resize.jqGrid');
    //设置表格功能按钮，只留一个刷新
    jQuery(grid_selector).jqGrid('navGrid',pager_selector,
        { 	//navbar options
            edit: false,
            editicon : 'ace-icon fa fa-pencil blue',
            add: false,
            addicon : 'ace-icon fa fa-plus-circle purple',
            del: false,
            delicon : 'ace-icon fa fa-trash-o red',
            search: false,
            searchicon : 'ace-icon fa fa-search orange',
            refresh: true,
            refreshicon : 'ace-icon fa fa-refresh green',
            view: false,
            viewicon : 'ace-icon fa fa-search-plus grey'
        }
    )
});