public class Address {
  private String street;
  private String state;
  private String city;
  private String country;
  private String cep;

  // GETTERS
  public String getStreet() {
    return street;
  }

  public String getState() {
    return state;
  }

  public String getCity() {
    return city;
  }

  public String getCountry() {
    return country;
  }

  public String getCep() {
    return cep;
  }

  // SETTERS
  public void setStreet(String street) {
    if (street.isEmpty()) {
      System.out.println("The 'street' can't be empty");
      return;
    }
    this.street = street;
  }

  public void setState(String state) {
    if (state.isEmpty()) {
      System.out.println("The 'state' can't be empty");
      return;
    }
    this.state = state;
  }

  public void setCity(String city) {
    if (city.isEmpty()) {
      System.out.println("The 'city' can't be empty");
      return;
    }
    this.city = city;
  }

  public void setCountry(String country) {
    if (country.isEmpty()) {
      System.out.println("The 'country' can't be empty");
      return;
    }
    this.country = country;
  }

  public void setCep(String cep) {
    if (cep.isEmpty()) {
      System.out.println("The 'cep' can't be empty");
      return;
    }
    this.cep = cep;
  }

}
