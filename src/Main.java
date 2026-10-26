//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    new UsuarioService(new EmailNotificador()).registrar("Joao");
    new UsuarioService(new SmsNotificador()).registrar("Pedro");
    new UsuarioService(new WhatsappNotificador()).registrar("Filipe");
}
