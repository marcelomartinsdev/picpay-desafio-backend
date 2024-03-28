package br.com.marcelomartinsdev.picpaydesafiobackend.wallet;

public enum WalletType {
    COMUM(1),
    LOJISTA(2);

    private Integer value;

    private WalletType(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
