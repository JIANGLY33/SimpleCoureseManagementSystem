$("#submit").click(function() {
    var code = 400;
    var res;
    $.ajax({
        url:"/login",
        type:"POST",
        data: $("#login").serialize(),
        datatype:"json",
        async:false,
        success: function(result){
            if(result.code == 400){
                alert("账号或者密码错误！");
            }
            else {
                code = 200;
                res = result.res.user;
            }
        },
    });
    if(code == 200){
        httpPost("/manage",res);
    };
})

function httpPost(URL, PARAMS) {
    var temp = document.createElement("form");
    temp.action = URL;
    temp.method = "post";
    temp.style.display = "none";

    for (var x in PARAMS) {
        var opt = document.createElement("textarea");
        opt.name = x;
        opt.value = PARAMS[x];
        temp.appendChild(opt);
    }

    document.body.appendChild(temp);
    temp.submit();

    return temp;
}
