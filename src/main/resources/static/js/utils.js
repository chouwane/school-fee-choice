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