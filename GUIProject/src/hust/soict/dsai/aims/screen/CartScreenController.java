package hust.soict.dsai.aims.screen;

public class CartScreenController {

	   private Cart cart;

	   @FXML
	   private TableView<Media> tblMedia;

	   @FXML
	   private TableColumn<Media, String> colMediaTitle;

	   @FXML
	   private TableColumn<Media, String> colMediacategory;

	   @FXML
	   private TableColumn<Media, Float> colMediaCost;

	   public CartScreenController(Cart cart) {
	      super();
	      this.cart = cart;
	   }

	   @FXML
	   private void initialize() {

	      colMediaTitle.setCellValueFactory(
	            new PropertyValueFactory<Media, String>("title"));
	      colMediacategory.setCellValueFactory(
	            new PropertyValueFactory<Media, String>("category"));
	      colMediaCost.setCellValueFactory(
	            new PropertyValueFactory<Media, Float>("cost"));
	      tblMedia.setItems(this.cart.getItemsOrdered());
	   }

void updateButtonBar(Media media) {
    btnRemove.setVisible(true);
    if(media instanceof Playable) {
       btnPlay.setVisible(true);
    }
    else {
       btnPlay.setVisible(false);
    }
 }
@FXML
void btnRemovePressed(ActionEvent event) {
   Media media = tblMedia.getSelectionModel().getSelectedItem();
   cart.removeMedia(media);
}
}