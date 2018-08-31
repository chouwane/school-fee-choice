myAlert = function (res) {
    if(res.code == 0){

        /*swal({
            text: res.desc,
            type: "success",
            confirmButtonText: "确定"
        })*/
        swal("", res.desc, "success")

    }else{
        swal("", res.desc, "error")

    }

}


$.ajaxSetup({
    type : 'POST',
    error : function(XMLHttpRequest, textStatus, errorThrown) {

        console.log("errorThrown--->",XMLHttpRequest)
        if(XMLHttpRequest.status == 403){
            swal("", '已断线，需要重新登录', "error").then(
                function () {
                    window.location.href = "/login"
                },
                // handling the promise rejection
                function (dismiss) {
                    if (dismiss === 'timer') {
                        console.log('I was closed by the timer')
                    }
                }
            );
        }else {
            myAlert({code:-1, desc: '['+XMLHttpRequest.status+']系统异常，请联系管理员'});
        }
    },
    complete:function(XMLHttpRequest,status){
        var res = XMLHttpRequest.responseText;
        if(res=="{sessionState:0}") {
            location.href = "../../index.html";
        }
        else if(res.indexOf("id=\"container\"")>0){
            top.location.href = "../../index.html";
        }
    }
});