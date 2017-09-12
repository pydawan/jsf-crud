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
      String message = e.getCause().getMessage();
      Pattern pattern = Pattern.compile("^Duplicate entry \'(.*)\' for key \'(\\w+)\'$");
      Matcher matcher = pattern.matcher(message);
      if (matcher.matches()) {
         String field = matcher.group(2);
         String value = matcher.group(1);
         field = field.replace("_", " ");
         field = field.toUpperCase();
         message = String.format("Já existe um registro cadastrado com %s igual a %s!", field, value);
         message = message.replace("numero", "número");
      }
      return message;
   }
   
}
