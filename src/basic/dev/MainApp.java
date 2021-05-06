package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nameStudent;
		String idStudent;
		String cmndStudent;
		String nameClassStu;
		String nameSchoolStu;
		float diemTrungBinh;
		
		
		
		String namePerson;
		String adressPerson;
		String numberPhonePerson;
		float heSoLuongPerson;
		
	
		
		String nameCar;
		String hangCar;
		int giaCar;
		String colorCar;
		
		
		nameStudent = "Bui Hoang Quang Huy";
		idStudent  = "2060097";
		cmndStudent = " 192104524";
		nameClassStu = "20CDTH41";
		nameSchoolStu = "HueIC";
		diemTrungBinh = 9.6f;
		
		
		namePerson = " Thuy Chau";
		adressPerson = " 12/54 Tan Trao";
		numberPhonePerson = " 0327303004";
		heSoLuongPerson = 3.2f;
		
		
		nameCar = "Xe Mercedes Pro";
		hangCar = "Mercedes";
		giaCar = 2000000;
		colorCar = "Red";
		
		
		System.out.println("Thong tin SV thu nhat:");
		System.out.printf("Ho va ten: %s, ID = %s, So CMND = %s, Lop: %s, Truong: %s, Diem trung binh: %f\n "
							,nameStudent,idStudent,cmndStudent,nameClassStu,nameSchoolStu,diemTrungBinh);
		
			
		System.out.println("Thong tin Person thu nhat");
		System.out.printf("Ten: %s, Dia chi: %s, So dien thoai: %s, He so luong: %f\n"
							,namePerson,adressPerson,numberPhonePerson,heSoLuongPerson);
		
	
		
		System.out.println("Thong tin xe thu nhat:");
		System.out.printf("Ten xe: %s, Hang: %s, gia: %d, Mau: %s", nameCar,hangCar,giaCar,colorCar);
		
		System.out.println("\n-------------------------------------");
		
		
		nameStudent = "Tran Quoc Huy";
		idStudent  = "2060000";
		cmndStudent = " 197371283";
		nameClassStu = "20CDTH41";
		nameSchoolStu = "HueIC";
		diemTrungBinh = 8.0f;
		
		
		namePerson = " Tran Van B";
		adressPerson = " Kiet 6 Hai Trieu";
		numberPhonePerson = " 0869732019";
		heSoLuongPerson = 3.2f;
		
		
		nameCar = "Xe Mercedes Limited";
		hangCar = "Mercedes";
		giaCar = 10000000;
		colorCar = "Yellow";
		
		
		System.out.println("Thong tin SV thu hai:");
		System.out.printf("Ho va ten: %s, ID = %s, So CMND = %s, Lop: %s, Truong: %s, Diem trung binh: %f\n "
							,nameStudent,idStudent,cmndStudent,nameClassStu,nameSchoolStu,diemTrungBinh);
		
			
		System.out.println("Thong tin Person thu hai");
		System.out.printf("Ten: %s, Dia chi: %s, So dien thoai: %s, He so luong: %f\n"
							,namePerson,adressPerson,numberPhonePerson,heSoLuongPerson);
		
		
		
		System.out.println("Thong tin xe thu hai:");
		System.out.printf("Ten xe: %s, Hang: %s, gia: %d, Mau: %s", nameCar,hangCar,giaCar,colorCar);
		
		

	}

}
