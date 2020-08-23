var SUCCESS = 0;
var ERROR = 1;
var NEED_LOGIN = 10;
var ILLEGAL_ARGUMENT = 2;

/**
 * 确认提示框
 */
function confrim(info, url, data, successCallback, errorCallback) {
    layer.confirm(info, {
        btn: ['确定', '取消'] //按钮
    }, function () {
        layer.closeAll('dialog');
        $.ajax({
            type: "post",
            url: url,
            data: data,
            success: successCallback,
            error: errorCallback
        });
    });
}

function show1() {
    $("#close1").show();
    $("#open1").hide();
    $("#search_form .col-xs-6:gt(1)").show();
    return false;
}
function hide1() {
    $("#close1").hide();
    $("#open1").show();
    $("#search_form .col-xs-6:gt(1)").hide();
    reset_search();
    return false;
}

function search_data() {
    var data = [];
    var search = $("#search_form div.row div.col-xs-6 ");
    for (var i = 0; i < search.length; i++) {
        var children = $("#search_form div.row div.col-xs-6:eq("+i+")").children();
        for (var j = 0; j < children.length; j++) {
            if (isBlank($(children[2]).get(0).value)){
                break;
            }
            var param = $(children[0]).get(0).value+"-"+$(children[1]).get(0).value+"-"+$(children[2]).get(0).value;
            data.push(param);
            break;
        }
    }
    return data;
}

function search() {
    var data = search_data();
    init({params:JSON.stringify(data)});
}

function reset_search() {
    var search = $("#search_form div.row div.col-xs-6 ");
    for (var i = 0; i < search.length; i++) {
        var children = $("#search_form div.row div.col-xs-6:eq("+i+")").children();
        for (var j = 0; j < children.length; j++) {
            if (!isBlank($(children[2]).get(0).value)){
                $(children[2]).get(0).value = "";
                $(children[2]).siblings("div").find("input").val("");
                break;
            }
        }
    }
    init("");
}

function isBlank(str) {
    if (str == null || str == "" || str == "undefine"){
        return true;
    }
    return false;
}