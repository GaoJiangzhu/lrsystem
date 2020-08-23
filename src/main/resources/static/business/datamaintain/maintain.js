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
    {name:'Title',index:'Title'},
    {name:'unit',index:'unit'},
    {name:'order',index:'order'},
    {name:'rrintISSN',index:'rrintISSN',  align:"center"},
    {name:'electronicISSN',index:'electronicISSN'},
    {name:'subscribe',index:'subscribe'},
    {name:'set',index:'set'}
];

/**
 * 初始化表格
 * @param grid_selector
 * @param pager_selector
 */
function initGrid(grid_selector, pager_selector){
    jQuery(grid_selector).jqGrid({
        // 数据源
        url:"getDataMaintenance",
        // 数据格式
        datatype: "json",
        // 数据获取方式
        mtype:"GET",
        // 高度
        height: 392,
        // 表头名称
        colNames:['题名','单位', '唯一订阅号','印本ISSN','电子版ISSN','订购号','套订号'],
        // 表头数据
        colModel:colModel,
        //添加左侧行号
        rownumbers: true,
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
        multiselect: true,
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