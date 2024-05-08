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
