package entity.util.statics;

public enum Department {
    //Bölüm bilgilerini içeren enum
    MANAGEMENT_INFORMATION_SYSTEM("Yönetim Bilişim Sistemleri"),
    BUSINESS("İşletme"),
    FINANCE_AND_BANKING("Finans ve Bankacılık"),
    INTERNATIONAL_TRADE_AND_BUSINESS("Uluslararası Ticaret"),
    DENTISTRY("Diş Hekimliği"),
    LAW("Hukuk"),
    ISLAMIC_SCIENCES("İslami İlimler");

    private String name;
    Department(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
