package day43.BankaUygulamasıMehmetHoca;

public class Customer extends Person {

  private String ibanNo;
  public Customer (){}


  public Customer(
    String adi,
    String adres,
    String email,
    String tel,
    String ibanNo
  ) {
    super(adi, adres, email, tel);
    this.setIbanNo(ibanNo);
  }

  public String getIbanNo() {
    return ibanNo;
  }

  public void setIbanNo(String ibanNo) {
    this.ibanNo = ibanNo;
  }
}
