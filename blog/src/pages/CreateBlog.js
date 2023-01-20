import { useState } from "react"

export function CreateBlogPage(props) {
    const [title, setTitle] = useState("")
    const [text, setText] = useState("")
    const createBlog = () => {
        fetch('/api/v1/blog', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                title,
                text
            })
        })
    }


    return (
        <div>
            <h2>Naujas irasas</h2>
            <div>
                <label htmlFor="title">Antraste</label>
            </div>
            <div>
                <input
                    id="title"
                    value={title}
                    onChange={(e) => setTitle(e.target.value)}
                    require
                />
            </div>
            <div>
                <label htmlFor="text">Tekstas</label>
            </div>
            <div>
                <textarea
                    id="text"
                    value={text}
                    onChange={(e) => setText(e.target.value)}
                />
                <div>
                    <button onClick={createBlog}>Publikuoti</button>
                </div>
            </div>
        </div>
    )
}