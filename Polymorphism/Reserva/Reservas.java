import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/** Interface grafica principal da Central de Experiencias. */
public class Reservas extends JFrame {
    private static final Color AZUL_ESCURO = new Color(27, 44, 75);
    private static final Color AZUL = new Color(43, 98, 173);
    private static final Color FUNDO = new Color(242, 246, 251);
    private static final Color TEXTO = new Color(43, 54, 70);
    private static final Locale LOCALE_BR = Locale.forLanguageTag("pt-BR");
    private static final NumberFormat MOEDA = NumberFormat.getCurrencyInstance(LOCALE_BR);

    private final JTextField nomeField = new JTextField(20);
    private final JComboBox<String> tipoCombo = new JComboBox<>(new String[] {
        "Passeio cultural", "Trilha guiada", "Passeio de barco", "Experiência VIP"
    });
    private final JSpinner quantidadeSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
    private final JTextField valorBaseField = new JTextField("100,00", 12);
    private final JCheckBox oficinaCheckBox = new JCheckBox("Incluir oficina (+ R$ 25,00 por pessoa)");
    private final JComboBox<String> dificuldadeCombo = new JComboBox<>(new String[] {
        "Leve", "Moderada", "Desafiadora"
    });
    private final JCheckBox rotaEstendidaCheckBox = new JCheckBox("Rota estendida (+20%)");
    private final JTextField adicionalVipField = new JTextField("30,00", 12);
    private final JPanel opcoesPanel = new JPanel();
    private final JTextArea resultadoArea = new JTextArea();
    private final JLabel totalLabel = new JLabel("Total: -", SwingConstants.RIGHT);

    public Reservas() {
        super("Reservas | Central de Experiências");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(820, 560));
        setSize(980, 680);
        setLocationRelativeTo(null);
        construirInterface();
        atualizarOpcoes();
    }

    private void construirInterface() {
        JPanel raiz = new JPanel(new BorderLayout(0, 16));
        raiz.setBackground(FUNDO);
        raiz.setBorder(BorderFactory.createEmptyBorder(18, 20, 20, 20));
        setContentPane(raiz);

        JPanel cabecalho = new JPanel();
        cabecalho.setLayout(new BoxLayout(cabecalho, BoxLayout.Y_AXIS));
        cabecalho.setBackground(AZUL_ESCURO);
        cabecalho.setBorder(BorderFactory.createEmptyBorder(17, 20, 17, 20));
        JLabel titulo = new JLabel("CENTRAL DE EXPERIENCIAS");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("SansSerif", Font.BOLD, 22));
        JLabel subtitulo = new JLabel("Monte uma reserva e veja o valor calculado para o grupo.");
        subtitulo.setForeground(new Color(222, 231, 244));
        subtitulo.setFont(new Font("SansSerif", Font.PLAIN, 13));
        cabecalho.add(titulo);
        cabecalho.add(Box.createVerticalStrut(5));
        cabecalho.add(subtitulo);
        raiz.add(cabecalho, BorderLayout.NORTH);

        JPanel conteudo = new JPanel(new GridBagLayout());
        conteudo.setOpaque(false);
        GridBagConstraints principal = new GridBagConstraints();
        principal.gridy = 0;
        principal.weighty = 1;
        principal.fill = GridBagConstraints.BOTH;
        principal.insets = new Insets(0, 0, 0, 10);
        principal.gridx = 0;
        principal.weightx = 0.53;
        conteudo.add(criarPainelFormulario(), principal);
        principal.gridx = 1;
        principal.weightx = 0.47;
        principal.insets = new Insets(0, 10, 0, 0);
        conteudo.add(criarPainelResultado(), principal);
        raiz.add(conteudo, BorderLayout.CENTER);
    }

    private JPanel criarPainelFormulario() {
        JPanel painel = criarCartao();
        painel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 14, 0);
        JLabel titulo = new JLabel("Nova reserva");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        titulo.setForeground(AZUL_ESCURO);
        painel.add(titulo, c);

        c.gridwidth = 1;
        c.gridy++;
        c.weightx = 0;
        c.insets = new Insets(0, 0, 6, 12);
        painel.add(criarLabel("Nome do cliente"), c);
        c.gridx = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 10, 0);
        painel.add(nomeField, c);

        c.gridx = 0;
        c.gridy++;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(0, 0, 6, 12);
        painel.add(criarLabel("Experiência"), c);
        c.gridx = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 10, 0);
        tipoCombo.setSelectedIndex(0);
        tipoCombo.addActionListener(e -> atualizarOpcoes());
        painel.add(tipoCombo, c);

        c.gridx = 0;
        c.gridy++;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(0, 0, 6, 12);
        painel.add(criarLabel("Participantes"), c);
        c.gridx = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 10, 0);
        painel.add(quantidadeSpinner, c);

        c.gridx = 0;
        c.gridy++;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(0, 0, 6, 12);
        painel.add(criarLabel("Valor base por pessoa (R$)"), c);
        c.gridx = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 10, 0);
        painel.add(valorBaseField, c);

        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 2;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4, 0, 6, 0);
        JLabel opcoesTitulo = criarLabel("Opcoes da experiencia");
        opcoesTitulo.setFont(new Font("SansSerif", Font.BOLD, 13));
        painel.add(opcoesTitulo, c);

        c.gridy++;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 12, 0);
        opcoesPanel.setOpaque(false);
        opcoesPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(220, 228, 239)),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        painel.add(opcoesPanel, c);

        c.gridy++;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        painel.add(Box.createGlue(), c);

        JPanel botoes = new JPanel();
        botoes.setOpaque(false);
        JButton calcularButton = new JButton("Calcular reserva");
        calcularButton.setBackground(AZUL);
        calcularButton.setForeground(Color.WHITE);
        calcularButton.setFont(new Font("SansSerif", Font.BOLD, 13));
        calcularButton.setFocusPainted(false);
        calcularButton.addActionListener(e -> calcularReserva());
        JButton limparButton = new JButton("Limpar campos");
        limparButton.addActionListener(e -> limparCampos());
        botoes.add(calcularButton);
        botoes.add(limparButton);
        c.gridy++;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        painel.add(botoes, c);
        return painel;
    }

    private JPanel criarPainelResultado() {
        JPanel painel = criarCartao();
        painel.setLayout(new BorderLayout(0, 12));
        JLabel titulo = new JLabel("Resumo da reserva");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        titulo.setForeground(AZUL_ESCURO);
        painel.add(titulo, BorderLayout.NORTH);

        resultadoArea.setEditable(false);
        resultadoArea.setLineWrap(true);
        resultadoArea.setWrapStyleWord(true);
        resultadoArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        resultadoArea.setForeground(TEXTO);
        resultadoArea.setBackground(new Color(249, 251, 254));
        resultadoArea.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        resultadoArea.setText("Preencha os dados ao lado e clique em \"Calcular reserva\".\n\n"
                + "O valor final e calculado pelo metodo sobrescrito da classe especifica da experiencia.");
        painel.add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        totalLabel.setFont(new Font("SansSerif", Font.BOLD, 21));
        totalLabel.setForeground(AZUL);
        totalLabel.setBorder(BorderFactory.createEmptyBorder(8, 0, 2, 0));
        painel.add(totalLabel, BorderLayout.SOUTH);
        return painel;
    }

    private JPanel criarCartao() {
        JPanel painel = new JPanel();
        painel.setBackground(Color.WHITE);
        painel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(222, 229, 238)),
            BorderFactory.createEmptyBorder(18, 18, 18, 18)));
        return painel;
    }

    private JLabel criarLabel(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("SansSerif", Font.PLAIN, 12));
        label.setForeground(TEXTO);
        return label;
    }

    private void atualizarOpcoes() {
        opcoesPanel.removeAll();
        opcoesPanel.setLayout(new BorderLayout());
        String tipo = (String) tipoCombo.getSelectedItem();
        if ("Passeio cultural".equals(tipo)) {
            oficinaCheckBox.setOpaque(false);
            opcoesPanel.add(oficinaCheckBox, BorderLayout.CENTER);
        } else if ("Trilha guiada".equals(tipo)) {
            JPanel linha = new JPanel(new BorderLayout(10, 0));
            linha.setOpaque(false);
            linha.add(criarLabel("Nivel de dificuldade:"), BorderLayout.WEST);
            linha.add(dificuldadeCombo, BorderLayout.CENTER);
            opcoesPanel.add(linha, BorderLayout.CENTER);
        } else if ("Passeio de barco".equals(tipo)) {
            rotaEstendidaCheckBox.setOpaque(false);
            opcoesPanel.add(rotaEstendidaCheckBox, BorderLayout.CENTER);
        } else {
            JPanel linha = new JPanel(new BorderLayout(10, 0));
            linha.setOpaque(false);
            linha.add(criarLabel("Adicional VIP por pessoa (R$):"), BorderLayout.WEST);
            linha.add(adicionalVipField, BorderLayout.CENTER);
            opcoesPanel.add(linha, BorderLayout.CENTER);
        }
        opcoesPanel.revalidate();
        opcoesPanel.repaint();
    }

    private void calcularReserva() {
        try {
            String nome = nomeField.getText().trim();
            int quantidade = (Integer) quantidadeSpinner.getValue();
            double valorBase = lerValor(valorBaseField.getText(), "valor base");
            String tipo = (String) tipoCombo.getSelectedItem();
            ReservaExperiencia reserva;
            String detalhes;

            if ("Passeio cultural".equals(tipo)) {
                boolean incluiOficina = oficinaCheckBox.isSelected();
                reserva = new PasseioCultural(nome, quantidade, valorBase, incluiOficina);
                detalhes = incluiOficina ? "Oficina adicional: incluida (R$ 25,00 por pessoa)" : "Oficina adicional: nao incluida";
            } else if ("Trilha guiada".equals(tipo)) {
                String dificuldade = (String) dificuldadeCombo.getSelectedItem();
                reserva = new TrilhaGuiada(nome, quantidade, valorBase, dificuldade);
                detalhes = "Dificuldade: " + dificuldade + " (adicional aplicado ao valor base)";
            } else if ("Passeio de barco".equals(tipo)) {
                boolean rotaEstendida = rotaEstendidaCheckBox.isSelected();
                reserva = new PasseioDeBarco(nome, quantidade, valorBase, rotaEstendida);
                detalhes = rotaEstendida ? "Rota estendida: sim (+20%)" : "Rota estendida: nao";
            } else {
                double adicional = lerValor(adicionalVipField.getText(), "adicional VIP");
                reserva = new ExperienciaVip(nome, quantidade, valorBase, adicional);
                detalhes = "Adicional VIP: " + formatarMoeda(adicional) + " por pessoa";
            }

            // Polimorfismo: a implementacao chamada depende da classe concreta de reserva.
            double total = reserva.calcularValorTotal();
            String texto = "CENTRAL DE EXPERIENCIAS\n"
                    + "----------------------------------------\n"
                    + "Cliente: " + reserva.getNomeCliente() + "\n"
                    + "Experiencia: " + tipo + "\n"
                    + "Participantes: " + reserva.getQuantidadeParticipantes() + "\n"
                    + "Valor base por pessoa: " + formatarMoeda(reserva.getValorBasePorPessoa()) + "\n"
                    + detalhes + "\n"
                    + "----------------------------------------\n"
                    + "Valor medio final por pessoa: " + formatarMoeda(total / quantidade) + "\n\n"
                    + "Reserva calculada com sucesso.\n"
                    + "Confira os dados antes de confirmar qualquer pagamento.";
            resultadoArea.setText(texto);
            resultadoArea.setCaretPosition(0);
            totalLabel.setText("Total: " + formatarMoeda(total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Digite um valor numerico valido. Exemplo: 120,50", "Valor invalido", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Verifique os dados", JOptionPane.WARNING_MESSAGE);
        }
    }

    private double lerValor(String texto, String campo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo: " + campo + ".");
        }
        String normalizado = texto.trim().replace("R$", "").replace(" ", "");
        if (normalizado.contains(",") && normalizado.contains(".")) {
            normalizado = normalizado.replace(".", "").replace(",", ".");
        } else {
            normalizado = normalizado.replace(",", ".");
        }
        try {
            double valor = Double.parseDouble(normalizado);
            if (!Double.isFinite(valor) || valor < 0) {
                throw new IllegalArgumentException("O campo " + campo + " deve ser um valor nao negativo.");
            }
            return valor;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("O campo " + campo + " nao possui um numero valido.");
        }
    }

    private static String formatarMoeda(double valor) {
        return NumberFormat.getCurrencyInstance(LOCALE_BR).format(valor)
                .replace('\u00A0', ' ').replace('\u202F', ' ');
    }

    private void limparCampos() {
        nomeField.setText("");
        tipoCombo.setSelectedIndex(0);
        quantidadeSpinner.setValue(1);
        valorBaseField.setText("100,00");
        oficinaCheckBox.setSelected(false);
        dificuldadeCombo.setSelectedIndex(0);
        rotaEstendidaCheckBox.setSelected(false);
        adicionalVipField.setText("30,00");
        resultadoArea.setText("Preencha os dados ao lado e clique em \"Calcular reserva\".\n\n"
                + "O valor final e calculado pelo metodo sobrescrito da classe especifica da experiencia.");
        totalLabel.setText("Total: -");
        atualizarOpcoes();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            // Mantem o visual padrao do Swing caso o tema do sistema nao esteja disponivel.
        }
        SwingUtilities.invokeLater(() -> new Reservas().setVisible(true));
    }
}
