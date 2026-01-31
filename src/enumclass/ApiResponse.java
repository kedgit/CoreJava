package enumclass;

enum HttpStatusCode{
	OK(200, "SUCCESS"),
	CREATED(201, "CREATED"),
	BADREQUEST(400, "BAD REQUEST"),
	NOT_FOUND(404,"NOT FOUND ERROR"),
	INTERNAL_SERVER_ERROR(500,"INTERNAL SERVER ERROR");
	
	private int code;
	private String status;
	
	HttpStatusCode(int code,String status){
		this.code=code;
		this.status=status;
	}
	
	public int getCode() {
		return code;
	}
	public String getStatus(){
		return status;
	}
}

public class ApiResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpStatusCode http=HttpStatusCode.NOT_FOUND;
		System.out.println(http.getCode());
		System.out.println(http.getStatus());
	}

}
