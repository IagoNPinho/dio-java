public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        salarioMinimo = 2555.87;

        // numeros inteiro:
        // byte (-128 -- +127)
        // short (-32,768 -- +32,767)
        // int (-2,147,483,648 -- +2,147,483,647)
        // long (-9,223,372,036,854,775,808 -- +9,223,372,036,854,775,807)

        // numeros com ponto flutoante
        // float (-3.4028^38 -- +3,4028^38)
        // double (-1.7976^308 -- +1,7976^308)

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short) numeroNormal;

        // Declaração "especial"
        long saldo = 550320L;
        float numeroDecimal = 105.25F;

    }
}
