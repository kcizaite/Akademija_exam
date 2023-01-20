import { CreateBlogPage } from './pages/CreateBlog'
import { CreateCommentsPage } from './pages/CreateComments'
import './App.css';
import { HashRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div className="App">
        <HashRouter>
          <Routes>
            <Route path='/' element={<CreateBlogPage/>} />
            <Route path='/comments' element={<CreateCommentsPage />} />
          </Routes>
        </HashRouter>
    </div>
  );
}

export default App;
