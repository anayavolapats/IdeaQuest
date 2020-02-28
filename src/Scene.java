public class Scene {
    Scene[] choices;
    String text;
    int score;
    public Scene (String text, int variants, int score) {
        this.text = text;
        this.score = score;
        choices = new Scene[variants];
    }
}
