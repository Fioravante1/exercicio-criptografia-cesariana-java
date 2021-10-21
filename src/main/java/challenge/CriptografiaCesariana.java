package challenge;

import java.util.Locale;

public class CriptografiaCesariana implements Criptografia {

    private void validText(String texto) {
        if (texto.isEmpty()) throw new IllegalArgumentException();
        if (texto == null) throw new NullPointerException();
    }

    @Override
    public String criptografar(String texto) {
        validText(texto);

       String textMinusculo = texto.toLowerCase();
       int length = textMinusculo.length();

        String textCriptografado = "";

       for(int i = 0; i < length; i++) {
          char charIndex = textMinusculo.charAt(i);
          int intChar = charIndex;

          if (charIndex >= 'a' && charIndex <= 'z') {
              intChar += 3;
              char indexChar = (char) intChar;
              textCriptografado += indexChar;
          } else {
              textCriptografado += charIndex;
          }
       }

       return textCriptografado;
    }

    @Override
    public String descriptografar(String texto) {
        validText(texto);

        String textMinusculo = texto.toLowerCase();
        int length = textMinusculo.length();

        String textDescriptografado = "";

        for(int i = 0; i < length; i++) {
            char charIndex = textMinusculo.charAt(i);
            int intChar = charIndex;

            if (charIndex >= 'a' && charIndex <= 'z') {
                intChar -= 3;
                char indexChar = (char) intChar;
                textDescriptografado += indexChar;
            } else {
                textDescriptografado += charIndex;
            }
        }

        return textDescriptografado;
    }
}
