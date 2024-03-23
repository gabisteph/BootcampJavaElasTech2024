package Atividade4.suprimentos;

public class Suprimentos {
    private int id;
    private String descricaoItem;
    private int qtd;
    private double precoUnitario;

    public Suprimentos(int id, String descricaoItem, int qtd, double precoUnitario) {
        this.id = id;
        this.descricaoItem = descricaoItem;
        if (qtd > 0)
            this.qtd = qtd;
        else
            this.qtd = 0;

        if (precoUnitario > 0.0)
            this.precoUnitario = precoUnitario;
        else
            this.precoUnitario = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if (qtd > 0)
            this.qtd = qtd;
        else
            this.qtd = 0;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0.0)
            this.precoUnitario = precoUnitario;
        else
            this.precoUnitario = 0.0;
    }

    public double getInvoiceAmount() {
        return qtd * precoUnitario;
    }
}
