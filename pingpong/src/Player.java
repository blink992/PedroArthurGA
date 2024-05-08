package PingPong.src;

// Importações necessárias
import java.lang.String;
import java.awt.Color;
import java.awt.Graphics;

// Importando o pacote PingPong
import PingPong.*;

// Definição da classe Player
public class Player {

    // Variáveis de instância
    private int score; // Pontuação do jogador
    private int matches_won; // Número de partidas ganhas pelo jogador (ainda não utilizado)

    // Dimensões do jogador
    private int width = 20;
    private int height = 200;

    // Direção e velocidade do jogador
    private int direction = 0;
    private int velocity = 7;

    // Posição do jogador
    private int x;
    private int y;

    // Cor do jogador
    private Color color = Color.white;

    // Contador estático para acompanhar instâncias da classe Player
    private static int count = 0;

    // Construtor da classe Player
    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.score = 0; // Inicializando a pontuação como zero
    }
  // Método para obter a coordenada y do jogador
    public int getY(){
        return this.y;
    }

    // Método para definir a direção do jogador
    public void setDirection(int direction){
        this.direction = direction * this.velocity;
    }

    // Método para obter a direção do jogador
    public int getDirection() {
        return this.direction;
    }

    // Método para obter a largura do jogador
    public int getWidth(){
        return this.width;
    }

    // Método para obter a altura do jogador
    public int getHeight(){
        return this.height;
    }

    // Método para obter a pontuação do jogador
    public int getScore(){
        return this.score;
    }

    // Método para incrementar a pontuação do jogador
    public void incrementScore(){
        this.score++;
    }

    // Método para desenhar o jogador na tela
    public void draw(Graphics g){        
        g.setColor(this.color); // Define a cor do Jogador
        g.fillRect(this.x, this.y, this.width, this.height); // Desenha um Retângulo preenchido pela cor definida anteriormente
    }

    // Método para atualizar a posição do jogador
    public void updatePosition(){       
        // Verifica se a próxima posição não ultrapassa o limite superior
        if((this.y + this.direction) < 0)
            this.y = 0;
        // Verifica se a próxima posição não ultrapassa o limite inferior
        else if((this.y + this.direction) > (Game.height - this.height))
            this.y = (Game.height - this.height);
        else
            // Move o jogador na direção definida
            this.y = this.y + this.direction;
    }
}

