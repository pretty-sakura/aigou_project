package cn.itsource;

public class AjaxResult {
    private boolean success=true;
    private String msg="操作成功";
    private Object object;

    public static AjaxResult my(){
        return new AjaxResult();
    }
    public boolean isSurccess() {
        return success;
    }

    public AjaxResult setSurccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    public AjaxResult() {

    }

    public AjaxResult(boolean success, String msg, Object object) {
        this.success = success;
        this.msg = msg;
        this.object = object;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
