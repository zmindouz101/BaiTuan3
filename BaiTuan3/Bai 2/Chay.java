public class Chay {
    public static void main(String[] args) {
        BankAccount task = new BankAccount();
        task.setTaiKhoan(5000); 
// Mặc định hệ thống ngân hàng chỉ có 5000$ vài người dùng chỉ có thẻ rút được 3 lần là tối đa
        Thread TK1 = new Thread(task);
        Thread TK2 = new Thread(task);
        Thread TK3 = new Thread(task);
        Thread TK4 = new Thread(task);
        
        
        TK1.setName("Hoang");
        TK2.setName("Ngoc");
        TK3.setName("Long");
        TK4.setName("64121");
        
        
        TK1.start();
        TK2.start();
        TK3.start();
        TK4.start();
// Kết quả sẽ trả về Hoang, Ngoc, Long, sẽ rút được.
// Con lại 64121 sẽ không rút được và đươc thông báo Het Tien
    }
}