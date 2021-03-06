package br.com.qm.oo.universidade;

import java.util.Scanner;

public class ProgramaPrincipal {

	
	public static boolean cadastraProfessor(Scanner teclado, Professor[] professores) {
		
		teclado.nextLine();
		System.out.println("Vamos cadastrar o professor: ");
		System.out.println("Digite o nome do professor: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o CPF do professor: ");
		String cpf = teclado.next();
		System.out.println("Digite o n?mero de registro do professor: ");
		int nroRegistro = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o org?o de lota??o: ");
		String orgaoLotacao = teclado.nextLine();
		System.out.println("Digite o sal?rio: ");
		double salario = teclado.nextDouble();
		System.out.println("Digite o n?vel de gradua??o: ");
		String nivelGraduacao = teclado.next();
		System.out.println("Digite a disciplina ministrada: ");
		teclado.nextLine();
		String disciplina = teclado.nextLine();
		
		Professor professorCadastrado = new Professor(nome, cpf, nroRegistro, orgaoLotacao, salario, nivelGraduacao, disciplina, 
							0, 0);
		for (int i = 0; i < professores.length; i++) {
		
			if (professores[i] == null) {
				professores[i] = professorCadastrado;
				return true;
			}
		}
		
		return false;
	}
	
	public static void listaProfessores(Professor[] professores) {
		for (Professor professor : professores) {
			if (professor != null) {
				System.out.println(professor);
			}
		}
	}
	
	public static Professor buscaProfessor(Scanner teclado, Professor[] professores) {
		
		System.out.println("Digite o CPF pelo qual voc? quer pesquisar: ");
		String cpfConsultado = teclado.next();
		for (int i = 0; i < professores.length; i++) {
			
			if (professores[i] != null 
					&& professores[i].getCpf().equals(cpfConsultado)) {
				return professores[i];
			}
			
		}
		
		return null;
	}
	
	public static boolean removeProfessor(Scanner teclado, Professor[] professores) {
		
		System.out.println("Digite o CPF pelo qual voc? quer remover: ");
		String cpfConsultadoRemocao = teclado.next();
		
		for (int i = 0; i < professores.length; i++) {
			
			if (professores[i] != null 
					&& professores[i].getCpf().equals(cpfConsultadoRemocao)) {
				professores[i] = null;
				return true;
			}
			
		}
		
		return false;
	}
	
	public static void menuProfessores(Scanner teclado, Professor[] professores) {
		
		int opcaoMenuProfessores = 0;
		do {
			System.out.println("--- Menu de professores ---");
			System.out.println("1 - Cadastrar um professor");
			System.out.println("2 - Listar todos os professores");
			System.out.println("3 - Consultar professor por CPF");
			System.out.println("4 - Remover um professor");
			System.out.println("5 - Aumentar o sal?rio");
			System.out.println("0 - Voltar ao menu anterior");
			opcaoMenuProfessores = teclado.nextInt();
			
			switch (opcaoMenuProfessores) {
				case 1: 
					System.out.println("-- Cadastra professor --");
					if (cadastraProfessor(teclado, professores)) {
						System.out.println("Cadastro realizado com sucesso!");
					} else {
						System.out.println("Falha ao cadastra professor!");
					}
					break;
				case 2:
					System.out.println("-- Professores Cadastrados --");
					listaProfessores(professores);
					System.out.println("----");
					break;
				case 3:
					System.out.println("-- Consulta professor --");
					Professor professorConsultado = buscaProfessor(teclado, professores);
					if ( professorConsultado != null) {
						System.out.println(professorConsultado);
					} else {
						System.out.println("Professor n?o encontrado!");
					}
					break;
				case 4: 
					System.out.println("-- Remove professor --");
					if (removeProfessor(teclado, professores)) {
						System.out.println("Professor removido com sucesso!");
					} else {
						System.out.println("Professor n?o encontrado!");
					}
					break;
					
				case 5:
					System.out.println("-- Aumento de sal?rio --");
					Professor professorAumento = buscaProfessor(teclado, professores);
					if (professorAumento != null) {
						professorAumento.aumentaSalario();
						System.out.println("Sal?rio do "  + professorAumento.getNome() + " aumentado com sucesso!");
					} else {
						System.out.println("Professor n?o encontrado!");
					}
				case 0:
					System.out.println("Voltando ao menu anterior!");
					break;
				default:
					System.out.println("Menu professores -> Op??o inv?lida");
			}
			
		} while (opcaoMenuProfessores != 0);
		
		
	}
	
	public static boolean cadastraCoordenador(Scanner teclado, Coordenador[] coordenadores) {
		
		teclado.nextLine();
		System.out.println("Vamos cadastrar o coordenador: ");
		System.out.println("Digite o nome do coordenador: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o CPF do coordenador: ");
		String cpf = teclado.next();
		System.out.println("Digite o n?mero de registro do coordenador: ");
		int nroRegistro = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o org?o de lota??o: ");
		String orgaoLotacao = teclado.nextLine();
		System.out.println("Digite o sal?rio: ");
		double salario = teclado.nextDouble();
			
		Coordenador coordenadorCadastrado = new Coordenador(nome, cpf, nroRegistro, orgaoLotacao, salario);
	
		for (int i = 0; i < coordenadores.length; i++) {
		
			if (coordenadores[i] == null) {
				coordenadores[i] = coordenadorCadastrado;
				return true;
			}
		}
		
		return false;
	}
	
	public static void listaCoordenadores(Coordenador[] coordenadores) {
		for (Coordenador coordenador : coordenadores) {
			if (coordenadores != null) {
				System.out.println(coordenador);
			}
		}
	}

	public static Coordenador buscaCoordenador(Scanner teclado, Coordenador[] coordenadores) {
		
		System.out.println("Digite o CPF pelo qual voc? quer pesquisar: ");
		String cpfConsultado = teclado.next();
		for (int i = 0; i < coordenadores.length; i++) {
			
			if (coordenadores[i] != null 
					&& coordenadores[i].getCpf().equals(cpfConsultado)) {
				return coordenadores[i];
			}
			
		}
		
		return null;
	}
	
	public static boolean removeCoordenador(Scanner teclado, Coordenador[] coordenadores) {
		
		System.out.println("Digite o CPF pelo qual voc? quer remover: ");
		String cpfConsultadoRemocao = teclado.next();
		
		for (int i = 0; i < coordenadores.length; i++) {
			
			if (coordenadores[i] != null 
					&& coordenadores[i].getCpf().equals(cpfConsultadoRemocao)) {
				coordenadores[i] = null;
				return true;
			}
			
		}
		
		return false;
	}
	
	public static void menuCoordenadores(Scanner teclado, Coordenador[] coordenadores) {
		
		int opcaoMenuCoordenadores = 0;
		do {
			System.out.println("--- Menu de coordenadores ---");
			System.out.println("1 - Cadastrar um professor");
			System.out.println("2 - Listar todos os coordenadores");
			System.out.println("3 - Consultar professor por CPF");
			System.out.println("4 - Remover um professor");
			System.out.println("5 - Aumentar o sal?rio");
			System.out.println("0 - Voltar ao menu anterior");
			opcaoMenuCoordenadores = teclado.nextInt();
			
			switch (opcaoMenuCoordenadores) {
				case 1: 
					System.out.println("-- Cadastra coordenador --");
					if (cadastraCoordenador(teclado, coordenadores)) {
						System.out.println("Cadastro realizado com sucesso!");
					} else {
						System.out.println("Falha ao cadastra coordenador!");
					}
					break;
				case 2:
					System.out.println("-- Coordenadores Cadastrados --");
					listaCoordenadores(coordenadores);
					System.out.println("----");
					break;
				case 3:
					System.out.println("-- Consulta coordenador --");
					Coordenador coordenadorConsultado = buscaCoordenador(teclado, coordenadores);
					if ( coordenadorConsultado != null) {
						System.out.println(coordenadorConsultado);
					} else {
						System.out.println("Coordenador n?o encontrado!");
					}
					break;
				case 4: 
					System.out.println("-- Remove coordenador --");
					if (removeCoordenador(teclado, coordenadores)) {
						System.out.println("Coordenadores removido com sucesso!");
					} else {
						System.out.println("Coordenador n?o encontrado!");
					}
					break;
					
				case 5:
					System.out.println("-- Aumento de sal?rio --");
					Coordenador coordenadorAumento = buscaCoordenador(teclado, coordenadores);
					if (coordenadorAumento != null) {
						coordenadorAumento.aumentaSalario();
						System.out.println("Sal?rio do "  + coordenadorAumento.getNome() + " aumentado com sucesso!");
					} else {
						System.out.println("Coordenador n?o encontrado!");
					}
				case 0:
					System.out.println("Voltando ao menu anterior!");
					break;
				default:
					System.out.println("Menu coordenadores -> Op??o inv?lida");
			}
			
		} while (opcaoMenuCoordenadores != 0);
		
		
	}
	
	private static void imprimirFolha(Professor[] professores, Coordenador[] coordenadores,
			FuncionarioAdministrativo[] funcionariosAdm) {
		
		System.out.println("--- FOLHA DE PAGAMENTO ---");
		System.out.println("--- Professores ---");
		
		double total = 0;
		for (Professor professor : professores) {
			if (professor != null) {
				total += professor.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", professor.getNome(), professor.getSalario());
			}
		}
		
		System.out.println("\n--- Coordenadores ---");
		for (Coordenador coordenador : coordenadores) {
			if (coordenador != null) {
				total += coordenador.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", coordenador.getNome(), coordenador.getSalario());
			}
		}
		
		System.out.println("\n--- Funcion?rios Administrativos ---");
		for (FuncionarioAdministrativo funcionarioAdm : funcionariosAdm) {
			if (funcionarioAdm != null) {
				total += funcionarioAdm.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", funcionarioAdm.getNome(), funcionarioAdm.getSalario());
			}
		}
		
		
		System.out.printf("\nTotal de pagamentos deste m?s ----------- R$%.2f\n", total);
	}
	
	public static void main(String[] args) {
		// Sistema pra gerir a universidade
		// Inicializar a universidade (especificar quantos profissionais ela tem 
		// (professores, coordenadores e func Administrativos)
		
		// Manter (cadastrar, consultar e remover) Professores
		// Manter (cadastrar, consultar e remover) Coordenadores
		// Manter (cadastrar, consultar e remover) FuncionariosAdministrativos
		
		// Aumentar o sal?rio de um funcion?rio pelo seu cpf
		// Imprimir a folha de pagamento da universidade
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- UNIVERSIDADE QEEP MOVING ---");
		System.out.println("Quantos professores podem existir na sua universidade?");
		int qtdProfessores = teclado.nextInt();
		System.out.println("Quantos cordenadores podem existir na sua universidade?");
		int qtdCoordenadores = teclado.nextInt();
		System.out.println("Quantos funcion?rios administrativos podem existir na sua universidade?");
		int qtdFuncionariosAdm = teclado.nextInt();
		
		// Inicializando os arrays que servir?o como controle.
		Professor[] professores = new Professor[qtdProfessores];
		Coordenador[] coordenadores = new Coordenador[qtdCoordenadores];
		FuncionarioAdministrativo[] funcionariosAdm = new FuncionarioAdministrativo[qtdFuncionariosAdm];
		
		
		
		int opcaoMenuPrincipal = 0;
		do {
			System.out.println("--- Funcionalidades por tipo de funcionario ---");
			System.out.println("1 - Professores");
			System.out.println("2 - Coordenadores");
			System.out.println("3 - Funcion?rios Administrativos");
			System.out.println("4 - Imprimir folha de pagamento");
			System.out.println("0 - Para encerrar");
			
			opcaoMenuPrincipal = teclado.nextInt();
			
			switch (opcaoMenuPrincipal) {
				case 1:
					menuProfessores(teclado, professores);
					break;
				case 2:
					menuCoordenadores(teclado, coordenadores);
					break;
				case 3: 
					//menuFuncionariosAdm();
					break;
				case 4:
					imprimirFolha(professores, coordenadores, funcionariosAdm);
					break;
			default:
				System.out.println("Op??o inv?lida!");
			}
			
		} while (opcaoMenuPrincipal != 0);
		
		
		
		
		
		teclado.close();
	}

	
}