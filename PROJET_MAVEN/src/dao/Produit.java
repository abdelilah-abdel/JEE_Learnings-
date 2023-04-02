package dao ;

import java.io.Serializable ;
import javax.presistence.*;


@Entity
@Table(name="Produits")
public class Produit implements Serializable{
@Id
@Column(name="id_produit")
@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long ref ;
    private String des ;
    private double prix ;
    private  int qte ;


    public Produit( String des, double prix, int qte) {
        super();
        this.des = des;
        this.prix = prix;
        this.qte = qte;
    }


    public Produit(){
        super();
    }


    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}