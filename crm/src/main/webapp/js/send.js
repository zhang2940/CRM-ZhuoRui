$(document).ready(function () {
    //序列化表单
    $.fn.extend({
        serializeObject: function () {
            var o = {};
            var a = this.serializeArray();
            $.each(a, function () {
                if (this.name != "file") {//排除文件上传
                    if (o[this.name]) {
                        if (!o[this.name].push) {
                            o[this.name] = [o[this.name]];
                        }
                        o[this.name].push(this.value || '');
                    } else {
                        o[this.name] = this.value || '';
                    }
                }
            });
            return o;
        }
    });

    layui.use(['element', 'form', 'layedit', 'laydate', 'upload'], function () {
        var layedit = layui.layedit
        upload = layui.upload
        form = layui.form;

        //创建一个编辑器
        layedit.build('edit_message_content');

        //apk文件上传
        upload.render({
            elem: '#file'
            // , url: '/message/sendMessage'    //上传接口
            , auto: false //选择文件后不自动上传
            , bindAction: '#submitBtn'
            , accept: 'file'
            , field: 'myFile'
            , multiple: false
            , choose: function (obj) {
                obj.preview(function (index, file, result) {
                    var type = file.type;
                    var str = "image";
                    if (type.indexOf(str) > -1) {
                        console.log(type)
                        $('#file').html('<img src="' + result + '" alt="' + file.name + '" style="width: 260px;height: 120px">')
                        $('#file').append('<p>' + file.name + '</p>')
                    }
                    $('#file>p').html('<p>' + file.name + '</p>')
                });
            }
            , before: function (obj) { //obj参数包含的信息
                this.data = $('#send').serializeObject();
            }
        });
    });
})