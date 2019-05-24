$(document).ready(function () {

    $("#logon").click(function () {
        $.ajax(
            {
                url: "http://localhost:8080/springmvc_spring_mybatis_war_exploded/logon",
                async: true,
                type: "POST",
                data: {
                    name: "jacky",
                    password: "j123"
                },
                success: sucessReturn
            }
        )
    })

    function sucessReturn(data, textStatus, jqXHR) {
        if (data) {
            $("body").append(data);
        }
    }

})