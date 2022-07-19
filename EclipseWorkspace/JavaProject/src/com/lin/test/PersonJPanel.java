package com.lin.test;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;

@SuppressWarnings("serial")
public class PersonJPanel extends JPanel {

	private BindingGroup m_bindingGroup;
	private com.lin.test.Person person = new com.lin.test.Person();
	private JTextField ageJTextField;
	private JTextField emailJTextField;
	private JCheckBox maleJCheckBox;
	private JTextField nameJTextField;
	private JTextField phoneJTextField;

	public PersonJPanel(com.lin.test.Person newPerson) {
		this();
		setPerson(newPerson);
	}

	public PersonJPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0E-4 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4 };
		setLayout(gridBagLayout);

		JLabel ageLabel = new JLabel("Age:");
		GridBagConstraints labelGbc_0 = new GridBagConstraints();
		labelGbc_0.insets = new Insets(5, 5, 5, 5);
		labelGbc_0.gridx = 0;
		labelGbc_0.gridy = 0;
		add(ageLabel, labelGbc_0);

		ageJTextField = new JTextField();
		GridBagConstraints componentGbc_0 = new GridBagConstraints();
		componentGbc_0.insets = new Insets(5, 0, 5, 5);
		componentGbc_0.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_0.gridx = 1;
		componentGbc_0.gridy = 0;
		add(ageJTextField, componentGbc_0);

		JLabel emailLabel = new JLabel("Email:");
		GridBagConstraints labelGbc_1 = new GridBagConstraints();
		labelGbc_1.insets = new Insets(5, 5, 5, 5);
		labelGbc_1.gridx = 0;
		labelGbc_1.gridy = 1;
		add(emailLabel, labelGbc_1);

		emailJTextField = new JTextField();
		GridBagConstraints componentGbc_1 = new GridBagConstraints();
		componentGbc_1.insets = new Insets(5, 0, 5, 5);
		componentGbc_1.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_1.gridx = 1;
		componentGbc_1.gridy = 1;
		add(emailJTextField, componentGbc_1);

		JLabel maleLabel = new JLabel("Male:");
		GridBagConstraints labelGbc_2 = new GridBagConstraints();
		labelGbc_2.insets = new Insets(5, 5, 5, 5);
		labelGbc_2.gridx = 0;
		labelGbc_2.gridy = 2;
		add(maleLabel, labelGbc_2);

		maleJCheckBox = new JCheckBox();
		GridBagConstraints componentGbc_2 = new GridBagConstraints();
		componentGbc_2.insets = new Insets(5, 0, 5, 5);
		componentGbc_2.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_2.gridx = 1;
		componentGbc_2.gridy = 2;
		add(maleJCheckBox, componentGbc_2);

		JLabel nameLabel = new JLabel("Name:");
		GridBagConstraints labelGbc_3 = new GridBagConstraints();
		labelGbc_3.insets = new Insets(5, 5, 5, 5);
		labelGbc_3.gridx = 0;
		labelGbc_3.gridy = 3;
		add(nameLabel, labelGbc_3);

		nameJTextField = new JTextField();
		GridBagConstraints componentGbc_3 = new GridBagConstraints();
		componentGbc_3.insets = new Insets(5, 0, 5, 5);
		componentGbc_3.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_3.gridx = 1;
		componentGbc_3.gridy = 3;
		add(nameJTextField, componentGbc_3);

		JLabel phoneLabel = new JLabel("Phone:");
		GridBagConstraints labelGbc_4 = new GridBagConstraints();
		labelGbc_4.insets = new Insets(5, 5, 5, 5);
		labelGbc_4.gridx = 0;
		labelGbc_4.gridy = 4;
		add(phoneLabel, labelGbc_4);

		phoneJTextField = new JTextField();
		GridBagConstraints componentGbc_4 = new GridBagConstraints();
		componentGbc_4.insets = new Insets(5, 0, 5, 5);
		componentGbc_4.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_4.gridx = 1;
		componentGbc_4.gridy = 4;
		add(phoneJTextField, componentGbc_4);

		if (person != null) {
			m_bindingGroup = initDataBindings();
		}
	}

	protected BindingGroup initDataBindings() {
		BeanProperty<com.lin.test.Person, java.lang.Integer> ageProperty = BeanProperty.create("age");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty = BeanProperty.create("text");
		AutoBinding<com.lin.test.Person, java.lang.Integer, javax.swing.JTextField, java.lang.String> autoBinding = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, person, ageProperty, ageJTextField, textProperty);
		autoBinding.bind();
		//
		BeanProperty<com.lin.test.Person, java.lang.String> emailProperty = BeanProperty.create("email");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_1 = BeanProperty.create("text");
		AutoBinding<com.lin.test.Person, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_1 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, person, emailProperty, emailJTextField,
						textProperty_1);
		autoBinding_1.bind();
		//
		BeanProperty<com.lin.test.Person, java.lang.Boolean> maleProperty = BeanProperty.create("male");
		BeanProperty<javax.swing.JCheckBox, java.lang.String> textProperty_2 = BeanProperty.create("text");
		AutoBinding<com.lin.test.Person, java.lang.Boolean, javax.swing.JCheckBox, java.lang.String> autoBinding_2 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, person, maleProperty, maleJCheckBox,
						textProperty_2);
		autoBinding_2.bind();
		//
		BeanProperty<com.lin.test.Person, java.lang.String> nameProperty = BeanProperty.create("name");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_3 = BeanProperty.create("text");
		AutoBinding<com.lin.test.Person, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_3 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, person, nameProperty, nameJTextField,
						textProperty_3);
		autoBinding_3.bind();
		//
		BeanProperty<com.lin.test.Person, java.lang.String> phoneProperty = BeanProperty.create("phone");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_4 = BeanProperty.create("text");
		AutoBinding<com.lin.test.Person, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_4 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, person, phoneProperty, phoneJTextField,
						textProperty_4);
		autoBinding_4.bind();
		//
		BindingGroup bindingGroup = new BindingGroup();
		bindingGroup.addBinding(autoBinding);
		bindingGroup.addBinding(autoBinding_1);
		bindingGroup.addBinding(autoBinding_2);
		bindingGroup.addBinding(autoBinding_3);
		bindingGroup.addBinding(autoBinding_4);
		//
		return bindingGroup;
	}

	public com.lin.test.Person getPerson() {
		return person;
	}

	public void setPerson(com.lin.test.Person newPerson) {
		setPerson(newPerson, true);
	}

	public void setPerson(com.lin.test.Person newPerson, boolean update) {
		person = newPerson;
		if (update) {
			if (m_bindingGroup != null) {
				m_bindingGroup.unbind();
				m_bindingGroup = null;
			}
			if (person != null) {
				m_bindingGroup = initDataBindings();
			}
		}
	}

}
