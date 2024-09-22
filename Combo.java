public class Combo{

private Burguer burguer;
private Sobremesa sobremesa;
private Bebida bebida;


public Combo(Burguer burguer, Sobremesa sobremesa, Bebida bebida) {
    this.burguer = burguer;
    this.sobremesa = sobremesa;
    this.bebida = bebida;
}

public void setItens(Burguer burguer, Sobremesa sobremesa, Bebida bebida) {
    this.burguer = burguer;
    this.sobremesa = sobremesa;
    this.bebida = bebida;
}

public Burguer getBurguer() {
    return burguer;
}

public Sobremesa getSobremesa() {
    return sobremesa;
}

public Bebida getBebida() {
    return bebida;
}


public void mostrarItens() {
    System.out.println("Itens do combo:");
    System.out.println("Sanduíche: " + burguer.getDescricao() + " (" + burguer.getGramas() + "g)");
    System.out.println("Sobremesa: " + sobremesa.getDescricao() + " (" + sobremesa.getTamanho() + ")");
    System.out.println("Bebida: " + bebida.getDescricao() + " (" + bebida.getMl()
            + "ml)");
}
}