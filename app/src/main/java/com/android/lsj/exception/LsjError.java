package com.android.lsj.exception;


public class LsjError extends RuntimeException {

    /** 错误码：网络异常 */
    public static final int ERROR_CODE_NET_ERROR = -1;

    /** 错误码：服务器端参数校验失败 */
    public static final int ERROR_CODE_PARAMETER_SCHECK_ERROR = -2;

    /** 错误码：参数不合法 */
    public static final int ERROR_CODE__PARAMETER_IRREG_ERROR = -3;

    /** 错误码：JSON解析异常 */
    public static final int ERROR_CODE_JSON_ERROR = -4;

    /** 错误码：客户端校验服务器端数据失败 */
    public static final int ERROR_CODE_PARAMETER_CCHECK_ERROR = -5;

    /** 错误码：服务器端返回参数为空 ,例如：已和服务器建立连接,但是没有返回数据*/
    public static final int ERROR_CODE_PARAMETER_NULL_ERROR = -6;
    private int errorCode;

    private String orgResponse;

    public LsjError() {
        super();
    }
    public LsjError(String errorMessage) {
        super(errorMessage);
    }

    public LsjError(int errorCode, String errorMessage, String orgResponse) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.orgResponse = orgResponse;
    }

    public LsjError(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getOrgResponse() {
        return orgResponse;
    }

    public int getErrorCode() {
        return errorCode;
    }

    /**
     * 将服务器返回的errorMessage转换成客户端定义的易于理解的字符串
     *
     * @param errorCode
     * 			服务器返回的错误代码    错误编码需要服务器端给出
     * @param errorMessage
     * 			服务器返回的错误字符串，和错误代码一一对应
     * @return
     */
    public static String interpretErrorMessage(int errorCode, String errorMessage) {
//		switch (errorCode) {
//		 case 10000:
//			 errorMessage = "";
//			 break;
//		case 100001:
//			errorMessage = "";
//			break;
//		case 100002:
//		case 100003:
//			errorMessage = "";
//			break;
//		default:
//			break;
//		}

        return errorMessage;
    }

}
