package PaternLearn.CommandLearn;

//Заглушка для неиспользуемых кнопок. Иначе, пришлось бы проверять на наличие объекта.

/*
Объект NoCommand является примером пустого (null) объекта.
Пустые объекты применяются тогда, когда вернуть «полноценный» объект невозможно, но вам хочется избавить клиента от необходимости проверять null-ссылки.
Так, в нашем примере при отсутствии полноценного объекта, который можно было бы связать с ячейкой пульта, используется суррогатный объект NoCommand с фиктивным методом execute.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }
}
