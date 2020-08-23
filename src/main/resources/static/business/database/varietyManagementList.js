/**
 * user js方法
 * @author liuhaiyuan
 *
 */

//switch element when editing inline
function aceSwitch( cellvalue, options, cell ) {
    setTimeout(function(){
        $(cell) .find('input[type=checkbox]')
            .addClass('ace ace-switch ace-switch-5')
            .after('<span class="lbl"></span>');
    }, 0);
}
//enable datepicker
function pickDate( cellvalue, options, cell ) {
    setTimeout(function(){
        $(cell) .find('input[type=text]')
            .datepicker({format:'yyyy-mm-dd' , autoclose:true});
    }, 0);
}

function initGrid(grid_selector, pager_selector){
    jQuery(grid_selector).jqGrid({
        url:"jqgrid",
        datatype: "json",
        mtype:"GET",
        height: 392,
        colNames:['题名','唯一订购号', '印本ISSN','电子版ISSN','套订号','套题名'],
        colModel:[
            {name:'username',index:'username', width:60},
            {name:'realName',index:'realName',width:90},
            {name:'email',index:'email', width:150},
            {name:'isAdmin',index:'isAdmin', width:70},
            {name:'createDate',index:'createDate', width:90},
            {name:'loginDate',index:'loginDate', width:150}
        ],
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
        caption: "数据库收录品种管理列表"

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
    $(window).triggerHandler('resize.jqGrid');
    //navButtons
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