package br.org.jsf.crud;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>Traduz a mensagem de uma Exception de forma que seja legível para o usuário.</p>
 * @author thiago-amm
 * @version v1.0.0 12/09/2017
 * @since v1.0.0
 * @see java.lang.Exception
 */
public class TradutorExcecao {
   
   public static String traduzir(Exception e) {
      String mensagem = e.getCause().getMessage();
      Pattern padrao = Pattern.compile("^Duplicate entry \'(.*)\' for key \'(\\w+)\'$");
      Matcher comparador = padrao.matcher(mensagem);
      if (comparador.matches()) {
         String campo = comparador.group(2);
         String valor = comparador.group(1);
         campo = campo.replace("_", " ");
         campo = campo.toUpperCase();
         mensagem = String.format("Já existe um registro cadastrado com %s igual a %s!", campo, valor);
         mensagem = mensagem.replace("numero", "número");
      }
      return mensagem;
   }
   
}
