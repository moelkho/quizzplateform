/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources_i18n;

import java.util.ListResourceBundle;
import static ressources_i18n.Messages_es_ES.contents;

/**
 *
 * @author Youssef
 */
public class Messages_es_ES extends ListResourceBundle {

    @Override
    public Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {
        {"Count.one", "Preguntas de prueba"},
        {"Count.two", "Pregunta 1: ¿Cuál es la capital de Canadá?"},
        {"Count.three", "Nueva York"},
        {"Count.four", "Ottawa"},
        {"Count.five", "París"},            
        {"Count.six", "Pregunta 2: ¿Cuál es la moneda de Canadá?"},
        {"Count.seven", "Dirham"},
        {"Count.eight", "Euro"},
        {"Count.nine", "Dolar canadiense"},        
        {"Count.ten", "Pregunta 3: ¿Cómo se llama la Primera Ministra de Canadá?"},
        {"Count.eleven", "Trudeau"},
        {"Count.twelve", "Legault"},
        {"Count.therteen", "Trump"},
        {"Count.fourteen", "pagina de inicio"},
        
        //        Administartor page
        {"Count.a", "Gestión de usuarios y preguntas"},
        {"Count.b", "Hola"},
        {"Count.c", "Tu contraseña es"},
        {"Count.d", "Eres un / a"},
        {"Count.e", "Mostrar usuarias"},
        {"Count.f", "Mostrar preguntas"},
        {"Count.g", "Ver preguntas y respuestas"},
        {"Count.gg", " Ver el cuestionario"},       
        {"Count.h", " Gestión de usuarios"},
        {"Count.i", "Agregar usuario"},
        {"Count.j", " Nombre de usuario"},
        {"Count.k", " Contraseña"},
        {"Count.l", "Tipo de usuario"},
        {"Count.ll", " Administradoras"},
        {"Count.lll", " Los usuarios"},
        {"Count.m", " Enviar"},
        {"Count.n", " Gestión de preguntas"},
        {"Count.o", " Añadir pregunta"},
        {"Count.p", " Número de pregunta"},
        {"Count.pp", "Enonce Question"},
        {"Count.q", " Enviar"},
        {"Count.r", " Gestión de la respuesta"},
        {"Count.s", " Respuesta número 1"},
        {"Count.t", " Enonce Número 1"},
        {"Count.u", " Enlace al número de pregunta:"},
        {"Count.v", " Respuesta número 2"},
        {"Count.w", " Enonce Número 2"},
        {"Count.x", " Enlace al número de pregunta:"},
        {"Count.y", " Respuesta número 3"},
        {"Count.z", " Enonce Número 3"},
        {"Count.aa", " Enlace al número de pregunta:"},
        {"Count.bb", " Enviar"},
        {"Count.cc", " Regreso"},
        {"Count.dd", " Próxima"},
         
//        Main page
        {"Count.am", " CUESTIONARIO PARA UN CAMPEÓN"},
        {"Count.bm", " Acerca de"},
        {"Count.cm", " Contacto"},
        {"Count.dm", " Términos de Uso"},
        {"Count.em", " Programación"},
        {"Count.fm", " Estadísticas"},
        {"Count.gm", " Geografía"},
        {"Count.hm", " Nombre"},
        {"Count.im", "Contraseña"},
        {"Count.jm", "Administrador de Compte: mohamed // mot de passe: 1234"},
        {"Count.km", "Cuenta de usuario: youssef // contraseña: 5678"},
        {"Count.lm", " De lo contrario, en el caso de autenticación conduce a una página de error"},
        {"Count.mm", "2020 todos los derechos reservados "},
        
//        Score page
        {"Count.sa", " Aquí está"},
        {"Count.sb", " Your Score"},
        {"Count.sc", " Otro cuestionario"},
    };
    
}
