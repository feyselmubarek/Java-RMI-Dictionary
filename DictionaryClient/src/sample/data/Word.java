//1.Ermiyas Gezahegn… ATR /5552/09 ermiyas10080@gmail.com
// 2.Fasil Beshiwork … ATR/9359/09 …. fasilbeshiwork17@gmail.com
// 3. Feysel Mubarek … ATR/5064/09…feyselmubarek@gmail.com
// 4.Habte Assefa… ATR/0081/09…. habteasefa726@gmail.com
// 5. Hana Tesfaye.…. ATR/4224/09…. hanatesfaye223@gmail.com

package sample.data;

public class Word {
    private String title;
    private String definition;

    public Word(String title, String definition) {
        this.title = title;
        this.definition = definition;
    }

    public String getTitle() {
        return title;
    }

    public String getDefinition() {
        return definition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
