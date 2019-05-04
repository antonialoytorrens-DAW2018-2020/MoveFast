package clients;

/**
 *
 * @author antonialoy
 */
public class Casual extends Client{
    private double pagament;

    public Casual(double pagament, String DNI, String nomComplet, String telefon, String email) {
        super(DNI, nomComplet, telefon, email);
        this.pagament = pagament;
    }

    public double getPagament() {
        return pagament;
    }

    public void setPagament(double pagament) {
        this.pagament = pagament;
    }
    
}
