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
    {name:'unit',index:'unit', width:60,align:"center"},
    {name:'type',index:'type',width:90,align:"center"},
    {name:'allSum',index:'allSum', width:150,align:"center",},
    {name:'renewSum',index:'renewSum', width:70,align:"center"},
    {name:'newSum',index:'newSum', width:90, align:"center"},
    {name:'stopSum',index:'stopSum', width:150, align:"center"},
    {name:'remark',index:'remark', width:150, align:"center"}
];

/**
 * 初始化表格
 * @param grid_selector
 * @param pager_selector
 */
function initGrid(grid_selector, pager_selector){
    jQuery(grid_selector).jqGrid({
        // 数据源
        url:"getResourceType",
        // 数据格式
        datatype: "json",
        // 数据获取方式
        mtype:"GET",
        // 高度
        height: 392,
        // 表头名称
        colNames:['订购单位','资源类型', '总订购数量','续订数量','新增数量','停订数量','备注'],
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
        caption: "XXX(-XXXX)年度资源订购统计"
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

//测试数据
option = {
    title : {
        text: '某地区蒸发量和降水量',
        subtext: '纯属虚构'
    },
    tooltip : {
        trigger: 'axis'
        },
    legend: {
        data:['蒸发量','降水量']
    },
    toolbox: {
        show : true,
        feature : {
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'蒸发量',
            type:'bar',
            data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
        },
        {
            name:'降水量',
            type:'bar',
            data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
        }
    ]
};
