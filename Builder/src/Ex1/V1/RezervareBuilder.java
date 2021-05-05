package Ex1.V1;

public class RezervareBuilder implements IBuilder{
    Rezervare rezervare;

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic){
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }
    public RezervareBuilder setAreBautura(boolean areBautura){
        this.rezervare.setAreBautura(areBautura);
        return this;
    }
    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public RezervareBuilder setAreMancare(boolean areMancare){
        this.rezervare.setAreMancare(areMancare);
        return this;
    }
    public RezervareBuilder() {
        this.rezervare=new Rezervare(false,false,false,false,"");
    }


    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
