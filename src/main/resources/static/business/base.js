
document.write("<link rel='stylesheet' href='../toastr/toastr.css'></link>");
document.write("<script type='text/javascript' src='../toastr/toastr.js'></script>");

var promot = {
    default:"0",
    success:"1",
    error:"2",
    warning:"3",
    info:"4"
}

$(function () {
    toastr.options.positionClass = 'toast-bottom-right';
    $("body").prepend("<input type=\"hidden\" value=\"0\" id=\"promot\" th:value=\"${promot}\" />");
})

var DuzUtils = {
    notifySuccess:function (msg) {
        toastr.success(msg);
    },
    notifyError:function (msg) {
        toastr.error(msg);
    },
    notifyWarning:function (msg) {
        toastr.warning(msg);
    },
    notifyInfo:function (msg) {
        toastr.info(msg);
    }
}
