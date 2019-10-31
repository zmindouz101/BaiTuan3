public class BankAccount implements Runnable {
    private int TaiKhoan;

    public void setTaiKhoan(int TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public synchronized int getBalance() {
        return TaiKhoan;
    }

    public void run() {
        makeWithdraw(1500); /* Mặc định mỗi lần rút là 1500$, và hệ thống cứ thế trừ dần với mỗi tài khoản được tạo ra */
        
        if (TaiKhoan < 0) {
            System.out.println("He Thong Het Tien..... ");
        }
    }

    private synchronized void makeWithdraw(int amount) {
        if (TaiKhoan >= amount) {
            System.out.println(Thread.currentThread().getName() + " Vui Long Cho He Thong Rut Tien ...");
            TaiKhoan -= amount;
            System.out.println(Thread.currentThread().getName() + " So Tien Da Rut " + amount + " $");
        } else {
            System.out.println("Xin Loi, Tai Khoan Da Het Tien " + Thread.currentThread().getName());
        }
    }
}