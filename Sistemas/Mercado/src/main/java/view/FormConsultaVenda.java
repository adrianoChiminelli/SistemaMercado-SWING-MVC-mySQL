package view;

import controller.ConsultaVendaController;
import java.awt.event.KeyEvent;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import model.Venda;

public class FormConsultaVenda extends javax.swing.JPanel {

    public FormConsultaVenda() {
        initComponents();
        montaTbVenda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        lbTituloVenda = new javax.swing.JLabel();
        lbTituloProduto = new javax.swing.JLabel();
        pPesquisar = new javax.swing.JPanel();
        campoPesquisa = new javax.swing.JTextField();
        lbPesquisa = new javax.swing.JLabel();
        cbOpcao = new javax.swing.JComboBox<>();
        lbCampo = new javax.swing.JLabel();
        lbCampo1 = new javax.swing.JLabel();
        dataAte = new org.jdesktop.swingx.JXDatePicker();
        dataAte.setFormats(new String[] {"dd/MM/yyyy"} );

        setMinimumSize(new java.awt.Dimension(1280, 678));
        setName("Usuarios"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbProdutos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 224, 590, -1));

        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Cliente", "Quantidade", "Valor da Compra", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVendasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbVendas);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 224, 590, -1));

        lbTituloVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloVenda.setText("Vendas:");
        add(lbTituloVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 201, 67, -1));

        lbTituloProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTituloProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloProduto.setText("Produtos:");
        add(lbTituloProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 201, 81, -1));

        pPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        pPesquisar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });
        pPesquisar.add(campoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, 32));

        lbPesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPesquisa.setText("Pesquisar por:");
        pPesquisar.add(lbPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 113, -1));

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF" }));
        cbOpcao.setToolTipText("");
        pPesquisar.add(cbOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        lbCampo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCampo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCampo.setText("Data:");
        pPesquisar.add(lbCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 35, 40, -1));

        lbCampo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCampo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCampo1.setText("Campo:");
        pPesquisar.add(lbCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 113, -1));
        pPesquisar.add(dataAte, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 30));

        add(pPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 590, 163));
    }// </editor-fold>//GEN-END:initComponents

    private void montaTbVenda() {
        ConsultaVendaController controller = new ConsultaVendaController();
        tbVendas.setModel(controller.montaTabelaVenda(tbVendas));
    }

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
        }

//        if (!"".equals(campoPesquisa.getText())) {
//            String filtro = campoPesquisa.getText();
//            Optional<Venda> optCliente;
//
//            switch (cbOpcao.getSelectedIndex()) {
//                case 0 -> {
//                    try {
//                        optCliente = new Cliente().getCliente(Integer.parseInt(filtro));
//                        optCliente.ifPresent(cli -> montaTabela(cli));
//                    } catch (NumberFormatException e) {
//                        lbErro.setText("ID inválido, tente novamente!");
//                    }
//                }
//                case 1 -> {
//                    List<Cliente> clientes = new Cliente().getClienteByName(filtro);
//                    for (Cliente cli : clientes) {
//                        montaTabela(cli);
//                    }
//                }
//                case 2 -> {
//                    optCliente = new Cliente().getClienteByCPF(filtro);
//                    optCliente.ifPresent(cli -> montaTabela(cli));
//                }
//                default -> {
//                }
//            }
//        }
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void tbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVendasMouseClicked
        if (tbProdutos.getRowCount() > 0) {
            zeraTabela();
        }
        int linha = tbVendas.getSelectedRow();
        int id = (int) tbVendas.getValueAt(linha, 0);
        ConsultaVendaController controller = new ConsultaVendaController();
        tbProdutos.setModel(controller.montaTabelaProduto(tbProdutos, id));
    }//GEN-LAST:event_tbVendasMouseClicked

    private void zeraTabela() {
        while (tbProdutos.getRowCount() > 0) {
            ((DefaultTableModel) tbProdutos.getModel()).removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JComboBox<String> cbOpcao;
    private org.jdesktop.swingx.JXDatePicker dataAte;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCampo;
    private javax.swing.JLabel lbCampo1;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbTituloProduto;
    private javax.swing.JLabel lbTituloVenda;
    private javax.swing.JPanel pPesquisar;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbVendas;
    // End of variables declaration//GEN-END:variables
}