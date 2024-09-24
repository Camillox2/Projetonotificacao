public class Main {
    public static void main(String[] args) {
        NotificacaoService service = new NotificacaoService();


        //enviar email
        service.enviarNotificacao(new EmailFactory() {

        }, "Bem-vindo ao nosso sistema!");

        //enviar SMS
        service.enviarNotificacao(new SMSFactory(), "Seu código de verificação é 1234");

        //enviar PushNotificacao
        service.enviarNotificacao(new PushFactory(), "Você tem uma nova mensagem");


    }



}

