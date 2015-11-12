/**
 * This class is the controller for the main view for the application. It is specified as
 * the "controller" of the Main view class.
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('Unrestricted.view.login.LoginController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.login',
	    onLoginClick : function() {
		var me = this, form = me.getView().getForm();
		form.submit({
			method : 'POST',
			waitTitle : 'កំំពុងតភ្ជាប់',
			waitMsg : 'សូមរង់ចាំ...',
			success : function(form, action) {
				var wdw, data = Ext.JSON.decode(action.response.responseText);
				if (data.success) {
					wdw = form.owner.up('window');
					wdw.close();
					location.reload();
				} else {
					alert("your a big fat phoney!!!");
				}
			}
		});
    },

    onItemSelected: function (sender, record) {
        Ext.Msg.confirm('Confirm', 'Are you sure?', 'onConfirm', this);
    },

    onConfirm: function (choice) {
        if (choice === 'yes') {
            //
        }
    }
});
