public class Combo {
    private Produto burguer;
    private Produto sobremesa;
    private Produto bebida;
    private double precoTotal;

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                
                burguer = new Burguer("Duplo bacon", 18.00, 200);
                sobremesa = new Sobremesa("Cookie", 5.00, "Pequeno");
                bebida = new Bebida("Refrigerante", 4.50, 350);
                calcularPrecoTotal();
                break;
            case 2:
                
                burguer = new Burguer("Triplo bacon", 22.00, 300);
                sobremesa = new Sobremesa("Sorvete", 5.00, "Médio");
                bebida = new Bebida("Milkshake", 12.00, 500);
                calcularPrecoTotal();
                break;
            default:
                System.out.println("Opção inválida. Nenhum combo criado.");
                burguer = null;
                sobremesa = null;
                bebida = null;
                precoTotal = 0.0;
                break;
        }
    }

    private void calcularPrecoTotal() {
        precoTotal = burguer.getPreco() + sobremesa.getPreco() + bebida.getPreco();
    }

    public String toString() {
        if (burguer == null || sobremesa == null || bebida == null) {
            return "Nenhum combo foi criado.";
        }
        return "Contêm:\n" +
               "- " + burguer.toString() + "\n" +
               "- " + sobremesa.toString() + "\n" +
               "- " + bebida.toString() + "\n" +
               "Preço Total: R$ " + String.format("%.2f", precoTotal);
    }
}
