import DataTable from "components/Datatable";
import NavBar from "components/NavBar";
import Footer from "components/NavBar/Footer";

function App() {
    return (
      <>
      <NavBar />
        <div className="container">
          <h1 className="text-primary py-3">Dashboard de Vendas!</h1>

        <div className="row px-3">


        </div>

          <DataTable />
        </div>
        <Footer />
      </>
  );
}

export default App;
