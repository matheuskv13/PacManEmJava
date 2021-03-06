//Eduarda C. G. Armstrong
//Matheus Almeida
//Prof: Andre Katayama
//5 periodo
//Sistemas de Informacao
package pacman;

import com.googlecode.lanterna.terminal.TerminalSize;
import java.util.ArrayList;

public class Tabuleiro {

	private static char tab[][] = {
			{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', },
			{ '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', },
			{ '#', '.', '#', '#', '#', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#', '#', '#', '#', '.', '#', },
			{ '#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#', },
			{ '#', '.', '#', '.', '#', '#', '.', '#', '#', '#', '#', '.', '#', '#', '#', '#', '.', '#', '.', '#', },
			{ '#', '.', '#', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#', '.', '#', },
			{ '#', '.', '#', '.', '.', '.', '.', '#', '.', '#', '#', '.', '#', '#', '.', '#', '.', '#', '.', '#', },
			{ '#', '.', '#', '#', '#', '#', '.', '#', '.', '.', '#', '.', '.', '.', '.', '#', '.', '#', '.', '#', },
			{ '#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '#', '.', '#', '#', '#', '#', '.', '#', '.', '#', },
			{ '#', '.', '#', '.', '#', '#', '.', '#', '#', '#', '#', '.', '.', '.', '.', '#', '.', '.', '.', '#', },
			{ '#', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '.', '#', '#', '#', '.', '#', },
			{ '#', '.', '#', '.', '#', '.', '#', '#', '#', '#', '#', '.', '.', '#', '.', '.', '.', '.', '.', '#', },
			{ '#', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '#', '.', '#', '#', '#', '#', '#', '.', '#', },
			{ '#', '.', '#', '.', '#', '#', '.', '#', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '#', },
			{ '#', '.', '.', '.', '.', '.', '.', '#', '.', '#', '.', '#', '.', '#', '#', '#', '.', '#', '.', '#', },
			{ '#', '.', '#', '#', '#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '#', '#', '.', '#', '.', '#', },
			{ '#', '.', '#', '.', '.', '.', '.', '.', '.', '#', '.', '#', '.', '.', '.', '.', '.', '#', '.', '#', },
			{ '#', '.', '#', '.', '#', '#', '#', '#', '#', '#', '.', '#', '.', '#', '#', '#', '#', '#', '.', '#', },
			{ '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', },
			{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', },

	};

	private static int x, y;

	public static ArrayList<Posicao> setTabuleiro(TerminalSize terminalSize) {

		ArrayList<Posicao> Grid = new ArrayList<Posicao>();

		for (x = 0; x < tab.length; x++) {
			for (y = 0; y < tab.length; y++) {
				Grid.add(new Posicao(x, y));
			}
		}
		return Grid;
	}

	public static char getTab(int linha, int coluna) {

		return tab[linha][coluna];
	}

	//seta o tabuleiro
	public static void setTab(int i, int j, char c) {

		tab[i][j] = c;
	}
}