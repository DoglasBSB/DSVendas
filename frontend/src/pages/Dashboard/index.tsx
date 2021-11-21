import DataTable from "components/Datatable";
import BarCharts from "components/BarChart";
import NavBar from "components/NavBar";
import Footer from "components/NavBar/Footer";
import DonutChart from "components/DonutChart";


const Dashboard = () => {
    return (
        <>
        <NavBar />
          <div className="container">
            <h1 className="text-primary py-3">Dashboard de Vendas!</h1>
  
          <div className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
              <BarCharts />
             </div>
             <div className="col-sm-6">
              <h5 className="text-center text-secondary"> Todas Vendas</h5>
              <DonutChart />
             </div>      
          </div>
         
         <div className="py-3">
          <h2 className="text-primary">Todas de Vendas</h2>
  
         </div>
            <DataTable />
          </div>
          <Footer />
        </>
      
    );
  }
  
  export default Dashboard;