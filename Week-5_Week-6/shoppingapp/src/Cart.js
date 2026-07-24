function Cart({ Itemname, Price }) {
  return (
    <tr>
      <td>{Itemname}</td>
      <td>{Price}</td>
    </tr>
  );
}

export default Cart;