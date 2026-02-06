
package business;

public class Person {
    
    private int numEmpleado = 0001;
	private String name;				//NOMBRE
    private String geographic_data;		//PAIS
    private String dob;					//FECHA NACIMIENTO
    private String phone;				//TELF
    private String email;				//EMAIL	
    private String ssn;					//NUMERO DE LA SEGURIDAD SOCIAL
    private String imageTxt; 			//Número de beneficiario del plan de salud
    private String bankAccNum; 			//Números de cuentas bancarias
    
//Full face photos and comparable images
//Any unique identifying number, characteristic or code
    
    public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographic_data() {
        return geographic_data;
    }

    public void setGeographic_data(String geographic_data) {
        this.geographic_data = geographic_data;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getImagetxt() {
        return imageTxt;
    }

    public void setImageTxt(String imageTxt) {
        this.imageTxt = imageTxt;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }
    
    
    
}
