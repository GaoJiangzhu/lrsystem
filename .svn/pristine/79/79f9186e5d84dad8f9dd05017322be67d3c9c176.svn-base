/**
 * user js方法
 * @author liuhaiyuan
 *
 */


/**
 * 初始化表头
 * @type {*[]}
 */
var colModel = [
    {name:'name',index:'name', width:60,align:"center"},
    {name:'userCount',index:'userCount',width:90,align:"center"},
    {name:'userCount',index:'userCount',width:90,align:"center"},
    {name:'myac',index:'', width:80,align:"center", fixed:true, sortable:false, resize:false,
        formatter:function (cellvalue, options, rowdata) {//rowData可以获取整条数据
            return "<a href='' onclick=''>编辑</a><a href='' onclick='' style='margin-left: 10px'>删除</a>";
        }
    }
];

//replace icons with FontAwesome icons like above
function updatePagerIcons(table) {
    var replacement =
        {
            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',
            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',
            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',
            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'
        };
    $('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
        var icon = $(this);
        var $class = $.trim(icon.attr('class').replace('ui-icon', ''));

        if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
    })
}

/**
 * 初始化表格
 * @param grid_selector
 * @param pager_selector
 */
function initGrid(grid_selector, pager_selector){
    jQuery(grid_selector).jqGrid({
        url:"jqgrid",
        datatype: "json",
        mtype:"GET",
        height: 392,
        colNames:['角色','用户数量','', '操作'],
        colModel:colModel,
        rownumbers: true,
        viewrecords : true,
        rowNum:10,
        rowList:[10,20,30],
        pager : pager_selector,
        altRows: true,
        multiselect: true,
        multiboxonly: true,
        loadComplete : function() {
            var table = this;
            setTimeout(function(){
                updatePagerIcons(table);
            }, 0);
        },
        caption: "列表"

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
    );
});