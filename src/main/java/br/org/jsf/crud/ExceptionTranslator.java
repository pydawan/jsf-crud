package br.org.jsf.crud;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>Traduz a mensagem de uma Exception de forma que seja legível para o usuário.</p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 * @see java.lang.Exception
 */
public class ExceptionTranslator {
   
   public static String translate(Exception e) {
      String mensagem = e.getCause().getMessage();
      Pattern pattern = Pattern.compile("^Duplicate entry \'(.*)\' for key \'(\\w+)\'$");
      Matcher matcher = pattern.matcher(mensagem);
      if (matcher.matches()) {
         String campo = matcher.group(2);
         String valor = matcher.group(1);
         campo = campo.replace("_", " ");
         campo = campo.toUpperCase();
         mensagem = String.format("Já existe um registro cadastrado com %s igual a %s!", campo, valor);
         mensagem = mensagem.replace("numero", "número");
      }
      return mensagem;
   }
   
}
